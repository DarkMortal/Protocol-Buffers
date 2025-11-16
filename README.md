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
- Copy the generated files into the source folder of your project.
- Add the following maven dependency to your `pom.xml`.

      <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java</artifactId>
            <version>3.25.3</version>
      </dependency>
- In case of build errors (for eclipse), goto `project` → `properties` → `build path` and remove all the source folders.
- After installing the dependencies, update the source folder (right click on `src` → `source` → `use as source path`) and build path as needed.
## Using with python
- Compilation

      protoc --proto_path=./classes --python_out=./compiled_classes/python ./classes/Person.proto ./classes/Job.proto
- Copy the generated files to the source folder of your project.
- Installation

      pip3 install protobuf==3.20.*
## Using with javascript
- Compilation

      protoc --proto_path=./classes --js_out=import_style=commonjs,binary:./compiled_classes/javascript ./classes/Person.proto ./classes/Job.proto
- Copy the generated files to the source folder of your project.
- Install the necessary package(s):

      npm install google-protobuf
***
