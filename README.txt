📄 Description

The folder "src" contains the 3 exercises for Level 1 of Java Collections. At the end of the read me you can find all the exercice's statements. 

💻 Technologies Used

Java 8+ (required for Lambdas and Streams API)
IntelliJ IDEA or any Java IDE for code development
Command-line terminal (for compiling and running the code)

📋 Requirements

Java 8 or higher.
An IDE such as IntelliJ IDEA or Eclipse for coding.
The ability to compile and run Java code through the terminal.

🛠️ Installation

Clone the repository or download the project folder to your local machine.
Open the project folder in your IDE (such as IntelliJ IDEA).
Ensure that Java 8 or later is set as the SDK in your IDE.

▶️ Execution

Compiling and Running the Code: Once you have compiled the Java files, you can run them directly from the terminal. You will find the commands that you need to make the it run in each exercise folder.


- Exercici 1
Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.

Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.

Recorre la llista amb un for i amb un iterador.

- Exercici 2
Crea i emplena un List<Integer>. 

Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 

Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.

- Exercici 3
Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.