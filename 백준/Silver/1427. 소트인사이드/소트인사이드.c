#include <stdio.h>
#include <string.h>

int main()
{
	char a[11];

	scanf("%s", a);


	for (int i = 0; i<strlen(a); i++) {
		for (int j = 0; j<strlen(a); j++) {
			if (a[j] < a[j+1]) {
				int tmp = a[j];
				a[j] = a[j+1];
				a[j+1] = tmp;
			}
		}
	}

	printf("%s", a);

	return 0;
}
