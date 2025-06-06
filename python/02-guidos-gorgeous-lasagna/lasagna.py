"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


#: define the 'EXPECTED_BAKE_TIME' constant below.
EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2
#: Remove 'pass' and complete the 'bake_time_remaining()' function below.
def bake_time_remaining(actmin):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - actmin
    


#: Define the 'preparation_time_in_minutes()' function below.
# You might also consider defining a 'PREPARATION_TIME' constant.
# You can do that on the line below the 'EXPECTED_BAKE_TIME' constant.
# This will make it easier to do calculations.
def preparation_time_in_minutes(number_of_layers):
    
    """
    that takes the `number_of_layers` you want to add to the lasagna as an argument and returns how many minutes you would spend making them.
    
    """
    
    return PREPARATION_TIME*number_of_layers

#: define the 'elapsed_time_in_minutes()' function below.
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    return number_of_layers * PREPARATION_TIME + elapsed_bake_time

# : Remember to go back and add docstrings to all your functions
#  (you can copy and then alter the one from bake_time_remaining.)