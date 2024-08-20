
all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/*.java
	javac -d bin libs/*.java

aulas:
	javac -d bin aulas/*.java
	java -cp bin aulas/*

run:
	java -cp bin Main

clear:
	rm -r bin/*

git:
	git config --global user.email "20241cas10010031@estudantes.ifpr.edu.br"
	git config --global user.name "Im-caddu"