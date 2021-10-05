# ConsoleFormatter
An utility to print colorize on console screen.

## Usage
### Fix width and align left / right
```kotlin
println("Change${"File".fixLeft(20)}".fixRight(40))
```
![img.png](preview/sample1.png)

<hr />

### Fix and colorize
```kotlin
// Print title
println("${"Change".color(ConsoleColors.BLACK_BOLD)}${"File".fixLeft(20)}".fixRight(40))

// Print changed list
println("Added".fixRight(20).color(ConsoleColors.GREEN) + ": 30 file(s)")
println("Updated".fixRight(20).color(ConsoleColors.YELLOW) + ": 20 file(s)")
println("Removed".fixRight(20).color(ConsoleColors.RED) + ": 10 file(s)")
```
![img.png](preview/sample2.png)

<hr />

## Dependency

### Maven
```xml
<dependency>
  <groupId>org.cuongnv.consoleformatter</groupId>
  <artifactId>consoleformatter</artifactId>
  <version>0.0.1</version>
</dependency>
```

### Gradle Kotlin DSL
```kotlin
implementation("org.cuongnv.consoleformatter:consoleformatter:0.0.1")

```
### Gradle Groovy
```groovy
implementation 'org.cuongnv.consoleformatter:consoleformatter:0.0.1'
```

## License
```
Copyright 2021 Cuong V. Nguyen (github.com/cuongnv126).

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
