package root.demo.servicesCamunda;

import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import model.Appuser;
import root.repository.AppUserRepository;
import root.demo.model.FormSubmissionDto;

public class SendMailConfirmation implements JavaDelegate{
	
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private AppUserRepository userRepository;

    @Autowired
    private Environment env;

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void sendMail(Appuser user, String processInstanceId)  {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(user.getEmail());
        mail.setFrom(env.getProperty("spring.mail.username"));
        mail.setSubject("Confirmation account mail");
        mail.setText("Hello " + user.getName() + " " + user.getSurname() + ",\n\n "
                + "\n\n" + "Confirm and activate your account here:\n" + "\n"
                + "-------------------------------------------------------" + "\n http://localhost:4200/verification/"+ processInstanceId);
        javaMailSender.send(mail);
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("TU SAM");
        List<FormSubmissionDto> registrationObject = (List<FormSubmissionDto>) execution.getVariable("registration");
        System.out.println("TU SAM1");
        System.out.println(registrationObject);
        String mail = "";
        String processInstanceId = "";

        for (FormSubmissionDto formField : registrationObject) {

            if (formField.getFieldId().equals("email")) {
                mail = formField.getFieldValue();
            }
            if (formField.getFieldId().equals("processInstanceId")) {
                processInstanceId = formField.getFieldValue();
            }
        }
        Appuser user = userRepository.findOneByEmail(mail);
        sendMail(user, processInstanceId);
    }
}
