/* isPositive(...) virker, men kan simplificeres lidt */

void main() {
    isPositive(-5);
}

void isPositive(int number) {
    IO.println((number > 0) ? (number + " is positive") : (number + " is negative"));
}
