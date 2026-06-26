# Software Agency Billing System

## 📌 Problem Scenario

A fast-growing software company handles various types of IT services for its clients. To automate their accounting and finance department, they need a system to calculate the final invoice amount for different types of projects.

All projects share some core details: `Project_ID`, `Client_Name`, and `Base_Price`.

However, the final invoice calculation varies drastically depending on the type of service provided. There are three main categories of projects:

1. **WebProject:** Includes an additional `hostingFee`.
2. **AppProject:** Includes an additional `appStorePublishingFee`.
3. **MaintenanceContract:** Billed based on a `durationInMonths`.

---

## 🧾 Business Logic & Calculation Rules

Every project class must implement a method named `calculateFinalInvoice()` to determine the total bill and print the invoice.

- **WebProject:** \* `Final Amount = Base_Price + hostingFee + 10% agency service tax (applied on the sum of base price and hosting fee)`.
- **AppProject:** \* `Final Amount = Base_Price + appStorePublishingFee + 15% agency service tax (applied on the sum of base price and publishing fee)`.
- **MaintenanceContract:** \* `Final Amount = (Base_Price × durationInMonths) + 5% agency service tax (applied on the total calculated amount)`.

### 🎁 Special Requirements (Method Overloading)

The agency occasionally offers special discounts to loyal or long-term clients. To support this, an overloaded version of the billing method must be implemented:

- `calculateFinalInvoice(double discountPercentage)`: This should calculate the standard final invoice amount first (including fees and taxes) and then apply the given percentage reduction to the final total.

---

## 🛠️ Tasks to Implement

1. **Class Architecture (Inheritance & Encapsulation):**
   - Create a Superclass named `ProjectDetails` to hold shared attributes.
   - Create three Subclasses: `WebProject`, `AppProject`, and `MaintenanceContract` inheriting from the superclass.

2. **Constructor Chaining:**
   - Implement parameterized constructors for all subclasses that correctly use `super()` to pass common attributes to `ProjectDetails` while initializing subclass-specific variables locally.

3. **Method Overriding:**
   - Override the `calculateFinalInvoice()` method in each subclass to execute its specific financial rules.

4. **Method Overloading:**
   - Implement `calculateFinalInvoice(double discountPercentage)` in the subclasses to handle promotional discounts properly.
