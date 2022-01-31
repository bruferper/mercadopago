import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckoutComponent } from './website/pages/checkout/checkout.component';
import { FailureComponent } from './website/pages/checkout/failure/failure.component';
import { PendingComponent } from './website/pages/checkout/pending/pending.component';
import { SuccessComponent } from './website/pages/checkout/success/success.component';

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
    path: "checkout/success",
    component: SuccessComponent
  },
  {
    path: "checkout/pending",
    component: PendingComponent
  },
  {
    path: "checkout/failure",
    component: FailureComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
