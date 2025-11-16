from protobuff import Person_pb2
from protobuff import Job_pb2

# Create a Job message
job = Job_pb2.Job()
job.title = "Software Engineer"
job.company = "Tech Mahindra"
job.salary = 120000
job.type = Job_pb2.JobType.FULL_TIME

# Create a Person message and embed the Job
person = Person_pb2.Person()
person.id = 1
person.name = "Saptarshi"
person.email = "dragonbeast.saiyan@gmail.com"

# Set the nested job (two equivalent ways are shown)
person.job.CopyFrom(job)
# OR: person.job.title = job.title; person.job.company = job.company; ... (CopyFrom is cleaner)

# Add multiple phone numbers (repeated field)
person.phone_numbers.append("+91-1234567890")
person.phone_numbers.append("+91-9876543210")

# ---------- Binary serialization ----------
binary_data = person.SerializeToString()
print("Binary serialized length:", len(binary_data))

# ---------- Binary deserialization ----------
person2 = Person_pb2.Person()
person2.ParseFromString(binary_data)   # or Person_pb2.Person.FromString(binary_data)
print("\nDeserialized (binary) object:")
print(person2)

# ---------- JSON conversion (optional) ----------
# This requires google protobuf's json_format helper
from google.protobuf.json_format import MessageToJson, Parse

json_text = MessageToJson(person)
print("\nJSON representation:")
print(json_text)

# Parse JSON back to message
person3 = Person_pb2.Person()
Parse(json_text, person3)
print("\nParsed from JSON back to object:")
print(person3)