package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import model.Appuser;
import root.demo.model.AppUserDto;
import root.repository.AppUserRepository;

public class AppuserService {
	@Autowired
	AppUserRepository userRepository;
	
	public List<Appuser> getAll(){
		return userRepository.findAll();
	}
	
	public void addUser(Appuser u) {
		userRepository.save(u);
	}
	
	public void updateUser(Appuser u) {
		userRepository.save(u);
	}
	
	public Appuser getOne(Long id) {
		return userRepository.getOne(id);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public void deleteAllUser() {
		userRepository.deleteAll();
	}
	
	public Boolean existsUser(long id) {
		return userRepository.existsById(id);
	}

	/*public void setCurrentUser(Appuser user) {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("User"));
        Authentication authentication = new PreAuthenticatedAuthenticationToken(user.getId(), null, authorities);
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    public Appuser getCurrentUser() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        try {
            Long id = Long.parseLong(auth.getName());
            return userRepository.findById(id).orElseGet(null);
        } catch (Exception e) {
            return null;
        }
    }
*/
	
	public Appuser mapDTO(AppUserDto userDto){
		
		Appuser user = new Appuser();
		
		user.setId(userDto.getId());
		user.setCity(userDto.getCity());
		user.setCountry(userDto.getCountry());
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getEmail());
		user.setSurname(userDto.getSurname());
		user.setPassword(userDto.getPassword());
		
		return user;
	}
	
	public AppUserDto mapToDTO(Appuser user){
		return new AppUserDto(user);
	}
	
	public List<AppUserDto> mapAllToDTO(){
		
		List<Appuser> appusers = getAll();
		List<AppUserDto> appUserDTOs = new ArrayList<>();
		
		for(Appuser r : appusers){
			appUserDTOs.add(mapToDTO(r));
		}
		
		return appUserDTOs;
	}
}
