#include <iostream>

#define PI 3.14159265358979323846

enum class ShapeOption
{
	None = 0, Circle, Rectangle, Triangle, Square
};

int main()
{
	ShapeOption shapeOption = ShapeOption::None;

	do {
		std::cout << "Welcome to Area Calculator!" << std::endl;
		std::cout << "1. Circle" << std::endl;
		std::cout << "2. Rectangle" << std::endl;
		std::cout << "3. Triangle" << std::endl;
		std::cout << "4. Square" << std::endl;
		std::cout << "Select a shape (0 to quit): ";

		int option = 0;
		std::cin >> option;
		shapeOption = (ShapeOption)option;

		
		float area = 0.0f;

		
		if (shapeOption == ShapeOption::Circle)
		{
			std::cout << "You selected Circle!" << std::endl;
			float radius = 0.0f;

			std::cout << "Enter radius: ";
			std::cin >> radius;

			area = PI * radius * radius;
		}
		else if (shapeOption == ShapeOption::Rectangle)
		{
			std::cout << "You selected Rectangle!" << std::endl;
			float width = 0.0f;
			float height = 0.0f;

			std::cout << "Enter width: ";
			std::cin >> width;
			std::cout << "Enter height: ";
			std::cin >> height;

			area = width * height;
		}
		else if (shapeOption == ShapeOption::Triangle)
		{
			std::cout << "You selected Triangle!" << std::endl;
			float base = 0.0f;
			float height = 0.0f;

			std::cout << "Enter base: ";
			std::cin >> base;
			std::cout << "Enter height: ";
			std::cin >> height;

			area = base * height * 0.5;
		}
		else if (shapeOption == ShapeOption::Square)
		{
			std::cout << "You selected Square!" << std::endl;
			float width = 0.0f;

			std::cout << "Enter width: ";
			std::cin >> width;

			area = width * width;
		}

		std::cout << "Area: " << area << std::endl;
		std::cout << "\n";
		
		

	} while (shapeOption != ShapeOption::None);

	std::cout << "Exiting program..." << std::endl;
}