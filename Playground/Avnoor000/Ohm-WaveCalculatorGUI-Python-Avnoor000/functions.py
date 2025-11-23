import math

# Ohm's Law: V = IR
def ohms_law(empty_value, voltage=None, current=None, resistance=None):
    match empty_value:
        case 'voltage':
            return current * resistance
        case 'current':
            return voltage / resistance
        case 'resistance':
            return voltage / current

# Wave Equation: v = λf
def waves_func(empty_value, wave_speed=None, lambda_=None, frequency=None):
    match empty_value:
        case 'wave speed':
            return lambda_ * frequency
        case 'frequency':
            return wave_speed / lambda_
        case 'wavelength':
            return wave_speed / frequency

# Snell's Law: n1 * sin(θ1) = n2 * sin(θ2)
def refractiveindex_law(empty_value, n1=None, theta1=None, n2=None, theta2=None):
    match empty_value:
        case 'n1':
            return (n2 * math.sin(theta2)) / math.sin(theta1)
        case 'n2':
            return (n1 * math.sin(theta1)) / math.sin(theta2)