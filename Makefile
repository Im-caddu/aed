
all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/Aula20.java
	javac -d bin libs/*.java

run:
	java -cp bin Main

clear:
	rm -r bin/*

git:
	git config --global user.email 20241cas10010031@estudantes.ifpr.edu.br
	git config --global user.name Im-caddu