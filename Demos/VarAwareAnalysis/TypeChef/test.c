#ifdef A
#define X 4
#else
#ifdef B
#define X 4+6
#else
#define X 6
#endif
#endif

int main(){
3+X;
}
