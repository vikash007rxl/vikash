
//These collections can be mutable or immutable. You can use them according to your requirement. Scala.collection.mutable package contains all the mutable collections. You can add, remove and update data while using this package.

//Scala.collection.immutable contains all the immutable collections. It does not allow you to modify data. Scala imports this package by default. If you want mutable collection, you must import scala.collection.mutable package in your code.


//Scala Traversable
//It is a trait and used to traverse collection elements. It is a base trait for all scala collections.
//
//It implements the methods which are common to all collections.

//Method	Description
//def head: A	It returns the first element of collection.
//def init: Traversable[A]	It returns all elements except last one.
//def isEmpty: Boolean	It checks whether the collection is empty or not. It returns either true or false.
//def last: A	It returns the last element of this collection.
//def max: A	It returns the largest element of this collection.
//def min: A	It returns smallest element of this collection
//def size: Int	It is used to get size of this traversable and returns a number of elements present in this traversable.
//def sum: A	It returns sum of all elements of this collection.
//def tail: Traversable[A]	It returns all elements except first.
//def toArray: Array[A]	It converts this collection to an array.
//def toList: List[A]	It converts this collection to a list.
//def toSeq: Seq[A]	It converts this collection to a sequence.
//def toSet[B >: A]: immutable.Set[B]	It converts this collection to a set.

//Scala Iterable
//It is a next trait from the top of the hierarchy and a base trait for iterable collections. It extends traversable trait and provides important methods to concrete classes.

//Collections may be strict or lazy. Lazy collections have elements that may not consume memory until they are accessed, like Ranges. Additionally, collections may be mutable (the contents of the reference can change) or immutable (the thing that a reference refers to is never changed). Note that immutable collections may contain mutable items.