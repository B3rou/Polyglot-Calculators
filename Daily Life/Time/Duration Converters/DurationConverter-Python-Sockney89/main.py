import argparse

class DurationCalculator:
    """A class to convert durations between different time units."""

    def __init__(self,interactive=True,arguments=None):        
        
        # Define time Units and their values in seconds
        self.time_units = {
            'seconds': 1,
            'minutes': 60,
            'hours': 3600,
            'days': 86400
        }

        if interactive:
            self.run_interactive_mode()
        else:
            converted_value = self.convert_duration(arguments['value'], arguments['source_unit'], arguments['target_unit'])
            print(f"{arguments['value']} {arguments['source_unit']} is equal to {converted_value} {arguments['target_unit']}.")

    def convert_duration(self, value:int, source_unit:str, target_unit:str) -> float:
        """Convert duration from source unit to target unit"""

        # Sanity check on units
        if source_unit not in self.time_units:
            raise ValueError(f"Unsupported source unit: {source_unit}")
        if target_unit not in self.time_units:
            raise ValueError(f"Unsupported target unit: {target_unit}")

        # Sanity check; value must be non-negative
        if value < 0:
            raise ValueError("Duration value must be non-negative")
        
        # Convert value in source unit to seconds
        value_in_seconds = value * self.time_units[source_unit]

        # Convert seconds to duration in target unit
        converted_value = value_in_seconds / self.time_units[target_unit]

        return converted_value


    def run_interactive_mode(self):
        """Run the interactive mode for user input"""

        self.print_greeting()
        self.print_interactive_help()

        try:
            exit_flag = False
            while not exit_flag:
                user_choice = input("Type 'r' to run conversion or 'q' to exit. \n").strip().lower()
                if user_choice == 'r':
                    self.handle_conversion()
                elif user_choice == 'q':
                    print("Exiting interactive mode. Goodbye!")
                    exit_flag = True
                else:
                    print("Invalid choice. Please type 'r' or 'q'.")            
        except KeyboardInterrupt:
            print("\nExiting interactive mode. Goodbye!")
        
    def handle_conversion(self):
        """Handle a single conversion interaction with the user"""

        try:
            value = float(input("Enter the duration value to convert: ").strip())
            source_unit = input("Enter the source unit (seconds, minutes, hours, days): ").strip().lower()
            target_unit = input("Enter the target unit (seconds, minutes, hours, days): ").strip().lower()

            converted_value = self.convert_duration(value, source_unit, target_unit)
            print(f"{value} {source_unit} is equal to {converted_value} {target_unit}.")

        except ValueError as e:
            print(f"Error during conversion: {e}")

    def print_greeting(self):
        """Print a decorated greeting message"""

        print("************************************")
        print("  Welcome to the Duration Converter  ")
        print("************************************")

    def print_interactive_help(self):
        """Print help message for interactive mode"""

        print("This tool converts durations between seconds, minutes, hours, and days.")
        print("You will be prompted to enter a duration value, source unit, and target unit.")
        
        
        
if __name__ == "__main__":
    # Get arguments from command line
    parser = argparse.ArgumentParser(description="Duration Converter Tool")
    parser.add_argument('--value', type=float, help="Duration value to convert")
    parser.add_argument('--source_unit', type=str, help="Source time unit (seconds, minutes, hours, days)")
    parser.add_argument('--target_unit', type=str, help="Target time unit (seconds, minutes, hours, days)")
    args = parser.parse_args()

    # Determine mode based on provided arguments
    if args.value is not None and args.source_unit and args.target_unit:
        arguments = {
            'value': args.value,
            'source_unit': args.source_unit,
            'target_unit': args.target_unit
        }
        DurationCalculator(interactive=False, arguments=arguments)
    else:
        DurationCalculator(interactive=True)

