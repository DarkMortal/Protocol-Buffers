# Protocol-Buffers
Protocol Buffer examples for Java, Python &amp; Javascript
## Installation

## Using with java
- Compilation
    protoc --proto_path=./classes --java_out=./compiled_classes/java ./classes/Person.proto ./classes/Job.proto
## Using with python
- Compilation
    protoc --proto_path=./classes --python_out=./compiled_classes/python ./classes/Person.proto ./classes/Job.proto
## Using with javascript
- Compilation
    protoc --proto_path=./classes --js_out=./compiled_classes/javascript ./classes/Person.proto ./classes/Job.proto
***