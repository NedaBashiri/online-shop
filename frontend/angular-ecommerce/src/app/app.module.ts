import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component'
import {AppRoutingModule} from './app-routing.module';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { ProductListComponent } from './components/product-list/product-list.component';






@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,


  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,

  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
