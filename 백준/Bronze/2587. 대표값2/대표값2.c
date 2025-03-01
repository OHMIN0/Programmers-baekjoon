#include <stdio.h>
#include <math.h>


int main()
{
	int a[5];
	int sum = 0;

	for (int i = 0; i<5; i++) {
		scanf("%d", &a[i]);
		sum += a[i];
	}

	int tmp = 0;
	// 아래 반복문을 통해 오름차순 정렬을 시킨뒤, 중앙값을 구할 예정.
	for (int i = 0; i<5; i++) {
		for (int j = i+1; j<5; j++) {
			if (a[i] > a[j]) {
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
	}

	printf("%d\n", sum/5);


	printf("%d", a[2]);



	return 0;
}
