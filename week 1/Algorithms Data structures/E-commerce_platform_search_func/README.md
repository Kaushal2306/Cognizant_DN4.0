# E-commerce Platform Search Function

## Objective

Implement and compare **Linear Search** and **Binary Search** algorithms for searching products in an e-commerce platform.

---

## Scenario

An e-commerce platform needs a search functionality that can quickly locate products based on their **Product ID**. This project demonstrates two searching techniques and compares their efficiency.

---


### File Description

| File                    | Description                                                                |
| ----------------------- | -------------------------------------------------------------------------- |
| `Product.java`          | Defines the Product class with product details.                            |
| `ProductData.java`      | Stores the product dataset used for searching.                             |
| `SearchAlgorithms.java` | Implements Linear Search, Binary Search, and contains the `main()` method. |

---

## Product Attributes

Each product contains:

* Product ID
* Product Name
* Category

Example:

| Product ID | Product Name | Category    |
| ---------- | ------------ | ----------- |
| 101        | Shoes        | Fashion     |
| 102        | Watch        | Accessories |
| 103        | Laptop       | Electronics |
| 104        | Bag          | Fashion     |
| 105        | Mobile       | Electronics |

---

## Algorithms Implemented

### 1. Linear Search

Linear Search checks each product one by one until the required product is found.

**Time Complexity**

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(n)       |
| Worst Case   | O(n)       |

---

### 2. Binary Search

Binary Search works on a **sorted array**. It repeatedly divides the search space into two halves until the required product is found.

**Time Complexity**

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(log n)   |
| Worst Case   | O(log n)   |

---

## Big O Analysis

**Big O Notation** is used to measure how an algorithm's execution time grows as the input size increases.

* **O(1)** – Constant Time
* **O(log n)** – Logarithmic Time
* **O(n)** – Linear Time

---


---

## Output

```
Linear Search:
Product ID: 102
Product Name: Watch
Category: Accessories

Binary Search:
Product ID: 102
Product Name: Watch
Category: Accessories
```

---

## Conclusion

* Linear Search is simple and works on unsorted data but becomes slower as the dataset grows.
* Binary Search is significantly faster for large datasets but requires the data to be sorted.
* For an e-commerce platform where products are typically stored in sorted databases or indexed structures, **Binary Search is the preferred algorithm** because of its **O(log n)** search complexity.

---

## Author

**A.Kaushal**
