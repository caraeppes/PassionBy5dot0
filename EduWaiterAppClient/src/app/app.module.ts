import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { AdminRegisterComponent } from './components/admin-register/admin-register.component';
import {NgxWebstorageModule} from "ngx-webstorage";
import {HttpClientModule} from "@angular/common/http";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {AccountService} from "./services/account.service";
import { ShowHidePasswordModule } from 'ngx-show-hide-password';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminRegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    ShowHidePasswordModule,
    NgxWebstorageModule.forRoot()
  ],
  providers: [AccountService],
  bootstrap: [AppComponent]
})
export class AppModule { }
