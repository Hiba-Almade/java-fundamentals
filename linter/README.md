## JavaScript Linter:

#### A method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn't end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as `"Line 3: Missing semicolon."` if a line is missing a semicolon.

* Don’t show an error if the line is `empty`.
* Don’t show an error if the line ends with an opening curly brace `{`
* Don’t show an error if the line ends with a closing curly brace `}`
* Don’t show an error if the line contains `if` or `else`