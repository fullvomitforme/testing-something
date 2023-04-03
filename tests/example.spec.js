// @ts-check
const { test, expect } = require("@playwright/test");

test("has title", async ({ page }) => {
  await page.goto("https://agent.ondelivery.id/login");

  // Expect a title "to contain" a substring.
  await expect(page).toHaveTitle(/Ondelivery/);
});

test("get started link", async ({ page }) => {
  await page.goto("https://agent.ondelivery.id/login");

  // Click the get started link.
  await page.getByRole("button", { name: "Login" }).isDisabled();
});
