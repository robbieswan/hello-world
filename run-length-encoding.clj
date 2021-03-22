(defn my-zipmap [keys vals]
  (loop [my-map {}
         my-keys (seq keys)
         my-vals (seq vals)]
    (if (and my-keys my-vals)
      (recur (assoc my-map (first my-keys) (first my-vals))
             (next my-keys)
             (next my-vals))
      my-map)))

(my-zipmap [:one :two :three :four :five :six :seven :eight :nine :ten]
           (range 1 11))

;; Run-Length Encoding
;;; Definitions
;;; 1. A *run of data* is a sequence of consecutive occurrences of the same data value.
;;; 2. A *run-length encoding* (RLE) replaces runs with a *pair* consisting of the single
;;;    recurring value together with a count of its occurrences.

(def lots-of-zeros '(0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 1 1 0 0 0 1 1 1))

;; Task 1
;;; Write a one-line Clojure function to separate the lots-of-zeros list into six sub-lists:
;;; '(0 0 0 0 0 0 0 0) '(1) '(0 0 0 0 0 0 0 0 0) '(1 1) '(0 0 0) '(1 1 1)

(defn split-list [list-with-zeros]
)

(split-list lots-of-zeros)

;; Task 2
;;; Write a one-line Clojure function to replace each list of zeros with a 2-element list,
;;; the first element being the number of zeros, the second element being a 0. For example:
;;; '(0 0 0 0 0 0 0 0) becomes '(8 0)
(defn rle-list-of-zeros [list-of-zeros]
)

(rle-list-of-zeros '(0 0 0 0 0 0 0 0 0 0 0 0))

;; Task 3
;;; Write a one-line Clojure function to recombine the lists into one:
;;; '((8 0) 1 (9 0) 1 1 (3 0) 1 1 1)
(defn recombine-rle-lists [lists]
)

(recombine-rle-lists '((8 0) (1) (9 0) (1 1) (3 0) (1 1 1)))

;; Task 4
;;; Write a one-line Clojure function to recreate the original lots-of-zeros list from the recombined RLE list.
;;; Hint: use the 'flatten' BIF.
(defn rle-decode [rle-list]
)

(= lots-of-zeros (rle-decode '((8 0) 1 (9 0) 1 1 (3 0) 1 1 1)))
