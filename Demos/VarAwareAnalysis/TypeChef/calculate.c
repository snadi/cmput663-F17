#include <stdio.h>

int main (){
	int a = 64;
	int b = 0;

	#ifdef A
		int c = a;
	#else
		char c = a
	#endif

	if (c) {
		#ifdef B
			c += a;
			c /= b;
		#endif
	}
    
    return 0;
}
