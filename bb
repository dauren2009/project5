import tkinter as tk

class CalculatorApp:
    def __init__(self):
        self.window = tk.Tk()
        self.window.title("Calculator")

        self.label = tk.Label(self.window, text="Enter number:")
        self.label.pack()

        self.entry = tk.Entry(self.window)
        self.entry.pack()

        self.button = tk.Button(self.window, text="Calculate", command=self.on_button_click)
        self.button.pack()

        self.result_label = tk.Label(self.window, text="Result:")
        self.result_label.pack()

        self.window.mainloop()

    def validate_input(self, value):
        if value == "":
            return None
        try:
            return float(value)
        except ValueError:
            return None

    def calculate_square(self, number):
        return number * number

    def on_button_click(self):
        value = self.entry.get()
        number = self.validate_input(value)

        if number is None:
            self.result_label.config(text="Error: enter a number")
        else:
            result = self.calculate_square(number)
            self.result_label.config(text="Result: " + str(result))


CalculatorApp()
