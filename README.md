# Protocol-Buffers
Protocol Buffer examples for Java, Python &amp; Javascript
## Installation
- On Linux/Unix, using `apt` or `apt-get`

      apt install -y protobuf-compiler
      protoc --version  # Ensure compiler version is 3+
- On MacOS, using [Homebrew](https://brew.sh/)

      brew install protobuf
      protoc --version  # Ensure compiler version is 3+
- On Windows, using [Winget](https://learn.microsoft.com/en-us/windows/package-manager/winget/)

      > winget install protobuf
      > protoc --version # Ensure compiler version is 3+
***
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
