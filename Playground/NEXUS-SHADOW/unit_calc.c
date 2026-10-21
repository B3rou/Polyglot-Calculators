#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main(void){

  double input1, input2, result;
  char ch1[8], ch2[8], b, ch[8];
  bool keep = true;

  printf("\t************************************\n"
         "\t*                                  *\n"
         "\t* This is a unit adding calculator *\n"
         "\t*                                  *\n"
         "\t************************************\n");
  printf("\n\t******************************\n"
         "\t* For distance enter km or m *\n"
         "\t* For weight enter lb or kg  *\n"
         "\t* For time enter h or min    *\n"
         "\t******************************\n");

  while(keep){
    printf("Enter your first input(e.g. 1 km): ");
    scanf("%lf %s", &input1, ch1);

    if(strcmp(ch1, "km") == 0)
      input1 *= 1000;
    else if(strcmp(ch1, "h") == 0)
      input1 *= 60;
    else if(strcmp(ch1, "kg") == 0)
      input1 *= 2.2;
    else if(strcmp(ch1, "m") != 0
            && strcmp(ch1, "lb") != 0
            && strcmp(ch1, "min") != 0){
      printf("Invalid input try again\n");
      continue;
    }

    printf("Enter your second input(e.g. 1 m): ");
    scanf("%lf %s", &input2, ch2);

    if(strcmp(ch2, "km") == 0)
      input2 *= 1000;
    else if(strcmp(ch2, "h") == 0)
      input2 *= 60;
    else if(strcmp(ch2, "kg") == 0)
      input2 *= 2.2;
    else if(strcmp(ch2, "m") != 0
            && strcmp(ch2, "lb") != 0
            && strcmp(ch2, "min") != 0){
      printf("Invalid input try again\n");
      continue;
    }

    if((strcmp(ch1, "m") == 0
      || strcmp(ch1, "km") == 0)
      && (strcmp(ch2, "m") == 0
      || strcmp(ch2, "km") == 0)){
      result = (input1 + input2) / 1000;
      strcpy(ch, "km");
    }

    else if((strcmp(ch1, "h") == 0
      || strcmp(ch1, "min") == 0)
      && (strcmp(ch2, "h") == 0
      || strcmp(ch2, "min") == 0)){
      result = (input1 + input2) / 60;
      strcpy(ch, "h");
    }

    else if((strcmp(ch1, "lb") == 0
      || strcmp(ch1, "kg") == 0)
      && (strcmp(ch2, "lb") == 0
      || strcmp(ch2, "kg") == 0)){
      result = (input1 + input2) / 2.2;
      strcpy(ch, "kg");
    }else{
      printf("Unit mismatch try again\n");
      continue;
    }

     printf("The result is %.2lf%s\n", result, ch);

     while(getchar() != '\n')
     ;

     printf("Would you like to continue?(y if yes): ");
     b = getchar();
     if(b != 'y'){
       keep = false;
       printf("\n\t\t***********\n"
              "\t\t* Goodbye *\n"
              "\t\t***********\n");
     }
  }

  return 0;
}
