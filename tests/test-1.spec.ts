import { test, expect } from "@playwright/test";

test("test", async ({ page }) => {
  await page.goto("https://agent.ondelivery.id/login");
  await page.getByLabel("Username").click();
  await page.getByLabel("Username").fill("ondelondel");
  await page.getByLabel("Username").press("Tab");
  await page.getByLabel("Password").fill("Grandtour17!");
  await page.getByRole("button", { name: "Login" }).click();
  await page
    .locator("div")
    .filter({ hasText: /^Home$/ })
    .first()
    .isVisible();
  await page.getByRole("link", { name: "Waybill" }).click();
  await page.getByRole("link", { name: "Edit Waybill" }).click();
});
