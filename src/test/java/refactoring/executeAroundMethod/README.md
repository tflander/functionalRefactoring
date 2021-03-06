# Execute Around Method 

## Example

Demonstrate diffent ways that a transaction manager can release resources.

## Exercise

Re-design the API for an embedded device to make running operations safe.  For example, powering up
should properly allocate resources, retrieve from cache, or re-use pooled resources.
These resources should not be hung if a user forgets to power down.

Also, note that the operations can throw a "Fickle Finger of Fate" error.  When this happens, the device
needs to be powered down and resources freed or returned to a pool or cache.

Hint:  Consider creating a function constructor (curried function) to produce a Runnable for each operation.
This allows you to specify operations as an array of Runnables.

Hint: Lamdas cannot throw checked exceptions.  There are two options:
  1) Replace the checked exception with an unchecked exception.
  2) Wrap the checked exception with a try-catch and rethrow an unchecked exception

