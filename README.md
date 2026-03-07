# ☕ Java Collection Framework – Preparation Roadmap

A structured roadmap to learn the **Java Collection Framework** step-by-step.  
This guide includes the most important **interfaces, implementations, and commonly used methods**.

---

# 📚 Java Collection Hierarchy
```
Iterable
│
├── Methods
│ iterator()
│ forEach()
│ spliterator()
│
└── Collection
│
├── Methods
│ add(E e)
│ addAll(Collection c)
│ remove(Object o)
│ removeAll(Collection c)
│ retainAll(Collection c)
│ clear()
│
│ size()
│ isEmpty()
│ contains(Object o)
│ containsAll(Collection c)
│
│ iterator()
│ toArray()
│ toArray(T[] a)
│
│ stream()
│ parallelStream()
│
├── List
│
│ ├── Methods
│ │ add(int index, E element)
│ │ addAll(int index, Collection c)
│ │ get(int index)
│ │ set(int index, E element)
│ │ remove(int index)
│ │ indexOf(Object o)
│ │ lastIndexOf(Object o)
│ │ listIterator()
│ │ subList(int from, int to)
│
│ ├── ArrayList
│ │ add()
│ │ add(index, element)
│ │ get()
│ │ set()
│ │ remove()
│ │ clear()
│ │ size()
│ │ contains()
│ │ ensureCapacity()
│ │ trimToSize()
│
│ ├── LinkedList
│ │ addFirst()
│ │ addLast()
│ │ getFirst()
│ │ getLast()
│ │ removeFirst()
│ │ removeLast()
│ │ peek()
│ │ poll()
│ │ push()
│ │ pop()
│
│ ├── Vector
│ │ addElement()
│ │ removeElement()
│ │ elementAt()
│ │ firstElement()
│ │ lastElement()
│ │ capacity()
│
│ └── Stack
│ push()
│ pop()
│ peek()
│ empty()
│ search()
│
├── Set
│
│ ├── Methods
│ │ add()
│ │ remove()
│ │ contains()
│ │ size()
│ │ clear()
│ │ iterator()
│
│ ├── HashSet
│ │ add()
│ │ remove()
│ │ contains()
│ │ size()
│ │ clone()
│
│ ├── LinkedHashSet
│ │ add()
│ │ remove()
│ │ contains()
│ │ iterator()
│
│ └── TreeSet
│ add()
│ remove()
│ first()
│ last()
│ higher()
│ lower()
│ ceiling()
│ floor()
│ pollFirst()
│ pollLast()
│
└── Queue
│
├── Methods
│ add()
│ offer()
│ remove()
│ poll()
│ element()
│ peek()
│
├── PriorityQueue
│ add()
│ offer()
│ poll()
│ peek()
│ comparator()
│
├── Deque
│ │
│ ├── Methods
│ │ addFirst()
│ │ addLast()
│ │ offerFirst()
│ │ offerLast()
│ │ removeFirst()
│ │ removeLast()
│ │ peekFirst()
│ │ peekLast()
│ │ push()
│ │ pop()
│ │
│ ├── ArrayDeque
│ │ addFirst()
│ │ addLast()
│ │ removeFirst()
│ │ removeLast()
│ │
│ └── LinkedList
│ addFirst()
│ addLast()
│ removeFirst()
│ removeLast()
│
└── BlockingQueue (Advanced)
│
├── Methods
│ put()
│ take()
│ offer()
│ poll()
│
├── ArrayBlockingQueue
└── LinkedBlockingQueue
```

---

# 🗺️ Best Learning Order
1. Iterable  
2. Collection  
3. List  
4. ArrayList  
5. LinkedList  
6. Set  
7. HashSet  
8. LinkedHashSet  
9. TreeSet  
10. Queue  
11. PriorityQueue  
12. Deque  
13. ArrayDeque  
14. Map  
15. HashMap  
16. LinkedHashMap  
17. TreeMap  
18. Collections Class  
19. Arrays Class  
20. Iterator / ListIterator
