import person.Person;
import job.Job;
import job.JobType;

public class Handler {
	public static void main(String[] args) {
		Job job = Job.newBuilder()
            .setTitle("Software Engineer")
            .setCompany("Tech Mahindra")
            .setSalary(120000)
            .setType(JobType.FULL_TIME)
            .build();

        Person person = Person.newBuilder()
            .setId(1)
            .setName("Saptarshi Dey")
            .setEmail("dragonbeast.saiyan@gmail.com")
            .setJob(job)
            .addPhoneNumbers("+91-1234567890")   // Add repeated field
            .addPhoneNumbers("+91-9876543210")   // Add multiple entries
            .build();
        
        byte[] data = person.toByteArray();

        try {
            Person p2 = Person.parseFrom(data);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}

/*Output

id: 1
name: "Saptarshi Dey"
email: "dragonbeast.saiyan@gmail.com"
job {
  title: "Software Engineer"
  company: "Tech Mahindra"
  salary: 120000
  type: FULL_TIME
}
phone_numbers: "+91-1234567890"
phone_numbers: "+91-9876543210"
*/