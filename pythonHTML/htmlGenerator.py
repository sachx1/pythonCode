import sys

name = raw_input("what is your name? ")

file = open("somefile.html", "w")

message = """<html>
<head></head>
<body><p>"""

file.write(message)

file.write(name) #the \n is the line separator (on unix, might be different in windows/mac os)

message2 = """</p></body>
</html>"""

file.write(message2)

file.close()