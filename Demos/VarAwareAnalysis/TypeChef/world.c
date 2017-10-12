#include <stdio.h>

#ifdef WORLD
char* msg = "Hello World";
#endif

#ifdef BYE
char* msg = "Bye bye!\n";
#endif

main() {
	printf("%s", msg);
}