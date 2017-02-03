all: grammar

clean:
	rm -rf src/*.class

mrproper: clean
	rm -rf src/Looc.tokens
	rm -rf src/LoocLexer.java
	rm -rf src/LoocParser.java

grammar:
	./scripts/grammar
