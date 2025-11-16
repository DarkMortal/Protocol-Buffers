// Load generated protobuf classes
const PersonPb = require("./protobuff/Person_pb.js");
const JobPb = require("./protobuff/Job_pb.js");

// Extract message and enum classes
const Person = PersonPb.Person;
const Job = JobPb.Job;
const JobType = JobPb.JobType;

// Create Job message
let job = new Job();
job.setTitle("Software Engineer");
job.setCompany("Tech Mahindra");
job.setSalary(120000);
job.setType(JobType.FULL_TIME);

// Create Person message
let person = new Person();
person.setId(1);
person.setName("Saptarshi Dey");
person.setEmail("dragonbeast.saiyan@gmail.com");
person.setJob(job);

// Add phone numbers (repeated field)
person.addPhoneNumbers("+91-9876543210");
person.addPhoneNumbers("+91-9123456789");

// Serialize to binary
let bytes = person.serializeBinary();
// console.log("Serialized bytes:", bytes);

// Deserialize
let p2 = Person.deserializeBinary(bytes);
console.log("Deserialized Object: ");
console.log(p2.toObject());