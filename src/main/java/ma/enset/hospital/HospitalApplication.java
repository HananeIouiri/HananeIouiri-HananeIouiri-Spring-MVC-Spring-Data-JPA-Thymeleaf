package ma.enset.hospital;

import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}
	public void run(String... args) throws  Exception{
		patientRepository.save(new Patient(null,"IOUIRI","Hanane",new Date(), false , 500));
		patientRepository.save(new Patient(null,"iBRAHIMI","Hayat",new Date(), false , 501));
		patientRepository.save(new Patient(null,"JALAL","Karim",new Date(), true , 220));
	}
}