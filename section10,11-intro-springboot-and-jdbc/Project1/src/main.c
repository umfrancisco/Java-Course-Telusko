#include <stdio.h>

int main() {
	//printf("%c%c%c%c\n", chars[i], chars[j], chars[k], chars[l]);
    const char chars[] = {
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
        '0','1','2','3','4','5','6','7','8','9'
    };
    int n = sizeof(chars);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
					for (int m = 0; m < n; m++) {
						for (int o = 0; o < n; o++) {
							for (int p = 0; p < n; p++) {
								for (int q = 0; q < n; q++) {
									printf("%c%c%c%c%c%c%c%c\n",
										chars[i], chars[j], chars[k], chars[l],
										chars[m], chars[o], chars[p], chars[q]
									);
								}
							}
						}
					}
                }
            }
        }
    }

    return 0;
}
