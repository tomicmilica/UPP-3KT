package root.demo.servicesCamunda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.form.FormField;
import org.camunda.bpm.engine.form.TaskFormData;
import org.camunda.bpm.engine.impl.form.type.EnumFormType;
import org.springframework.beans.factory.annotation.Autowired;

import model.ScientificArea;
import root.repository.*;

public class GetSciArea implements TaskListener {

    @Autowired
    IdentityService identityService;

    @Autowired
    private ScientificAreaRepository scientificAreaRep;

    @Override
    public void notify(DelegateTask delegateTask) {

        System.out.println("SC FIELDS LISTENER");

        TaskFormData taskFormData = delegateTask.getExecution().getProcessEngineServices().getFormService().getTaskFormData(delegateTask.getId());

        List<FormField> formFields = taskFormData.getFormFields();
        for(FormField ff : formFields) {
            System.out.println(ff.getId() + ff.getType());

            if(ff.getId().equals("scientificFields")) {
                EnumFormType enumFormType = (EnumFormType) ff.getType();
                Map<String, String> values = enumFormType.getValues();
                ArrayList<ScientificArea> n = (ArrayList<ScientificArea>) scientificAreaRep.findAll();
                for(ScientificArea scientificArea : n) {
                    values.put(scientificArea.getName(), scientificArea.getName());
                }
            }
        }
    }
}

