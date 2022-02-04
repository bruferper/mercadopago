import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckoutStatusComponent } from './website/pages/checkout/checkout-status/checkout-status.component';
import { CheckoutComponent } from './website/pages/checkout/checkout.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'checkout',
    pathMatch: 'full'
  },
  {
    path: "checkout",
    component: CheckoutComponent
  },
  {
    path: "checkout/status",
    component: CheckoutStatusComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
