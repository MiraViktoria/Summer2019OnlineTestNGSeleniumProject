package tests.day7;
   public class CSSNotes{

       /*
       Warm up task###########

Let's go cybertekschool.com
And find number of links and print this number


1. index.html
2. style.css
3. fucn.js


<!DOCTYPE html>
<html>
<head>
<title>My personal page</title>
</head>
<body>
<h1>Welcome to my page!</h1>
<h4>Please enter your info</h4>
<form>
<span>Enter your name:</span>
<input type="text" name="name">
<br>
<span>Enter your phone number:</span>
<input type="tel" name="phone">
</form>
</body>
</html>

css document

input {
font-family: Helvetica
background-color: blue;
margin: 0;
}


body {
height: 100vh;
padding: 0;
}

#################
How basic CSS selector looks like:

tagName[attribute='value'] | no //, no @, xpath would look like: //tagName[@attribute='value']

IN CSS, WE CAN SPECIFY ID LIKE THIS: #id

for example: #disappearing_button

also, it work like this: [id='disappearing_button']

For class name, in css we use .

.class

example: .h3 - it means, find element with class name h3

also, it works like this: [class='h3']

If, class name has a space, that means you need to put . in between. Because, space, in the class, it's a delimiter for different classes.

<button class="btn btn-info">Click Me</button>

[class='btn btn-primary'][name='button2'] - to specify 2 attributes

How about contains?

sure, we just put * after attribute

[attribute*='value'] - value can be partial, same like contains(@attribute,'value') in xpath


[id*='d'] - example, means that some element contains d in the id value

to match beginning of the attribute value, we use caret symbol: ^


java_boy _____
(^_^)
/| |\


How about end of the attribute?

[id$='end_of_value'] | $ means attribute ends with value

* - contains
^ - starts with
$ - ends with


button[onclick="button4()"] or
button[onclick='button4()']

in code: By.cssSelector

How we can move from parent to child element in css selector?

"space" or ">"

div input

What's the difference between space and > ? space in between means any child (can be grand, or grand grand child ) > means
 only direct child.    .container > h3 - means find element with h3 tag name, that has direct parent with class name container.

parent > child
        */

   }