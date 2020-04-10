CXX=g++
ANTLR_INCLUDE=/usr/include/antlr4-runtime
CXXFLAGS=-std=c++11 -Wno-attributes -I "$(ANTLR_INCLUDE)"
LDFLAGS=-lantlr4-runtime # -L "$(ANTLR_HOME)/lib"
DEPS=tinycLexer.cpp tinycParser.cpp
OBJS=tinycParser.o tinycLexer.o
SCOBJS=syncheck.o
ANTLRS=tinycBaseListener.h \
        tinycLexer.cpp \
        tinycLexer.tokens \
        tinycParser.cpp \
        tinycLexer.h \
        tinycParser.h \
        tinyc.interp \
        tinycLexer.interp \
        tinyc.tokens

all: syncheck

syncheck: $(SCOBJS) $(OBJS) $(DEPS)
	$(CXX) -o syncheck $(SCOBJS) $(OBJS) $(LDFLAGS)

%.o: %.cpp $(DEPS)
	$(CXX) -c -o $@ $< $(CXXFLAGS)

$(DEPS): tinyc.g4
	antlr4 -Dlanguage=Cpp -no-listener -no-visitor tinyc.g4

clean:
	rm -f $(OBJS) $(TOBJS) $(SCOBJS) syncheck $(ANTLRS)

