name = raw_input('What would you like to name your file? ')

f = open(name, 'w')

message = """<html>
<head></head>
<body><p>Hello World!</p></body>
</html>"""

f.write(message)
f.close()