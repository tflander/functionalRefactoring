# Consumer

Consumers take input and return nothing.  They are good indicators that their purpose is to
perform some side-effect, such as popping a message onto a queue or saving data.  Pure functions
do not have side-effects, but real systems need to interact with the outside world.
