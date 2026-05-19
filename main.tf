provider "aws" {
  region = "us-east-2"
}

resource "aws_instance" "phonebattery_server" {

  ami           = "ami-0c803b171269e2d72"
  instance_type = "t3.micro"

  tags = {
    Name = "PhoneBatteryTerraform"
  }
}