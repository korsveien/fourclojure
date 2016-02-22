(ns fourclojure.elementary)

;; Nothing but the truth #1
(= true true)

;; Simple math #2
(= (- 10 (* 2 3)) 4)

;; Intro to strings #3
(= "HELLO WORLD" (.toUpperCase "hello world"))

;; Intro to Lists #4
(= (list :a :b :c) '(:a :b :c))

;; Lists: conj #5
;;
;; When operating on a list, the conj function will return a new list
;; with one or more items "added" to the front.
(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))

;; Intro to Vectors #6
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; Vectors: conj #7
;;
;; When operating on a Vector, the conj function will return a
;; new vector with one or more items "added" to the end.
(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))

;; Intro to Sets #8
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; Sets: conj #9
(= #{1 2 3 4} (conj #{1 4 3} 2))

;; Intro to Maps #10
(= 20 ((hash-map :a 10 :b 20 :c 30) :b))
(= 20 (:b {:a 10 :b 20 :c 30}))

;; Maps: conj #11
;; When operating on a map, the conj function
;; returns a new map with one or more key-value pairs "added".
(= {:a 1 :b 2 :c 3} (conj {:a 1} {:b 2} [:c 3]))

;; Intro to sequences #12
(= 3 (first '(3 2 1)))
(= 3 (second [2 3 4]))
(= 3 (last (list 1 2 3)))

;; Sequences: rest #13
(= [20 30 40] (rest [10 20 30 40]))

;; Intro to functions #14
(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))

;; Double Down #15
(= ((fn double [x] (* x 2)) 2) 4)
(= ((fn [x] (* x 2)) 3) 6)
(= (#(* % 2) 11) 22)
(= ((partial * 2) 7) 14)