import sys

#name = input("name of the file ")

file = open("someFile.html", "w")

number = input("how many STL's are in use? ")

if number == 3:
    heartPiece = raw_input("name of the piece ")

    message = """oLoader.load('""" + heartPiece + """', function(object, materials) {

				// var material = new THREE.MeshFaceMaterial(materials);
				var material2 = new THREE.MeshLambertMaterial({
					color: 0xa65e00
				});

				object.traverse(function(child) {
					if (child instanceof THREE.Mesh) {

						// apply custom material
						child.material = material2;

						// enable casting shadows
						child.castShadow = true;
						child.receiveShadow = true;
					}
				});

				object.position.x = 0;
				object.position.y = 0;
				object.position.z = 0;

				object.scale.set(1, 1, 1);
				scene.add(object);

				document.getElementById('hideShow').addEventListener('click', function() {
					object.visible = !object.visible;
				});
			});"""
    



file.write(message)

#file.write(name) #the \n is the line separator (on unix, might be different in windows/mac os)

file.close()