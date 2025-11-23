use std::io;

fn main() {

    //Read in Input and parse it to a float in the temperature variable
    let mut input = String::new();
    let mut temperature: f64 = 0.0;

    println!("Enter temperature");
    loop {
        input.clear();
        io::stdin().read_line(&mut input).expect("error while reading");

        match input.trim().parse(){ // parse input to float(f64) and break if it's a valid number
            Ok(num) => {
                temperature = num;
                break;
            },
            Err(_) => println!("Please enter a valid number"),
        }
    }

    println!("Choose a conversion :");
    println!("1. Fahrenheit to Celsius");
    println!("2. Celsius to Fahrenheit");

    let mut choice = String::new();
    loop {
        choice.clear();// clean string choice each iteration
        io::stdin().read_line(&mut choice).expect("error while reading");

        // if choice is not 1 or 2 ask again
        match choice.trim(){
            "1" => break,
            "2" => break,
            _ => println!("Please type a number between 1 and 2"),
        }
    }
    //convert choice into integer (u32)
    let choice: u32 = choice.trim().parse().expect("Please type a number between 1 and 2");

    //Based on choice call correct method and print result
    if choice == 1 {
        let celsius = (temperature - 32.0) * 5.0 / 9.0;
        println!("{}°F is {}°C", temperature, celsius);
    } else if choice == 2 {
        let fahrenheit = (temperature * 9.0 / 5.0) + 32.0;
        println!("{}°C is {}°F", temperature, fahrenheit);
    }

}