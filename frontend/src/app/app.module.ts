import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CheckoutComponent } from './website/pages/checkout/checkout.component';
import { SuccessComponent } from './website/pages/checkout/success/success.component';
import { PendingComponent } from './website/pages/checkout/pending/pending.component';
import { FailureComponent } from './website/pages/checkout/failure/failure.component';

@NgModule({
  declarations: [
    AppComponent,
    CheckoutComponent,
    SuccessComponent,
    PendingComponent,
    FailureComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
