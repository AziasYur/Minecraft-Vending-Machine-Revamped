package com.azias.vendingmachine.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSodaMachine extends ModelBase {
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shelve1;
	ModelRenderer Shelve2;
	ModelRenderer Shelve3;
	ModelRenderer Shelve4;
	ModelRenderer Shelve5;
	ModelRenderer Glass;
	ModelRenderer CanBottom;
	ModelRenderer Can1;
	ModelRenderer Can2;
	ModelRenderer Can3;
	ModelRenderer Can4;
	ModelRenderer Can5;
	ModelRenderer Can6;
	ModelRenderer Can7;
	ModelRenderer Can8;
	ModelRenderer Can9;
	ModelRenderer Can10;
	ModelRenderer Can11;
	ModelRenderer Can12;
	ModelRenderer Can13;
	ModelRenderer Can14;
	ModelRenderer Can15;
	ModelRenderer Can16;
	ModelRenderer Button1;
	ModelRenderer Button2;
	ModelRenderer Button3;
	ModelRenderer Button4;
	ModelRenderer Button5;
	ModelRenderer Button6;
	ModelRenderer Button7;
	
	public ModelSodaMachine() {
		textureWidth = 128;
		textureHeight = 128;
		
		Shape1 = new ModelRenderer(this, 64, 110);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 16);
		Shape1.setRotationPoint(-8F, 22F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 33, 102);
		Shape2.addBox(0F, 0F, 0F, 4, 3, 16);
		Shape2.setRotationPoint(-8F, 19F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 22, 82);
		Shape3.addBox(0F, 0F, 0F, 4, 3, 16);
		Shape3.setRotationPoint(4F, 19F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 113);
		Shape4.addBox(0F, 0F, 0F, 8, 3, 12);
		Shape4.setRotationPoint(-4F, 19F, -4F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 53);
		Shape5.addBox(0F, 0F, 0F, 1, 22, 16);
		Shape5.setRotationPoint(-8F, -4F, -8F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 63, 26);
		Shape6.addBox(0F, 0F, 0F, 16, 4, 16);
		Shape6.setRotationPoint(-8F, -8F, -8F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 64, 92);
		Shape7.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape7.setRotationPoint(-8F, 18F, -8F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 86, 53);
		Shape8.addBox(0F, 0F, 0F, 5, 22, 16);
		Shape8.setRotationPoint(3F, -4F, -8F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 36, 48);
		Shape9.addBox(0F, 0F, 0F, 10, 22, 10);
		Shape9.setRotationPoint(-7F, -4F, -2F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shelve1 = new ModelRenderer(this, 0, 104);
		Shelve1.addBox(0F, 0F, 0F, 10, 1, 4);
		Shelve1.setRotationPoint(-7F, 0F, -6F);
		Shelve1.setTextureSize(128, 128);
		Shelve1.mirror = true;
		setRotation(Shelve1, 0F, 0F, 0F);
		Shelve2 = new ModelRenderer(this, 0, 104);
		Shelve2.addBox(0F, 0F, 0F, 10, 1, 4);
		Shelve2.setRotationPoint(-7F, 4F, -6F);
		Shelve2.setTextureSize(128, 128);
		Shelve2.mirror = true;
		setRotation(Shelve2, 0F, 0F, 0F);
		Shelve3 = new ModelRenderer(this, 0, 104);
		Shelve3.addBox(0F, 0F, 0F, 10, 1, 4);
		Shelve3.setRotationPoint(-7F, 8F, -6F);
		Shelve3.setTextureSize(128, 128);
		Shelve3.mirror = true;
		setRotation(Shelve3, 0F, 0F, 0F);
		Shelve4 = new ModelRenderer(this, 0, 104);
		Shelve4.addBox(0F, 0F, 0F, 10, 1, 4);
		Shelve4.setRotationPoint(-7F, 12F, -6F);
		Shelve4.setTextureSize(128, 128);
		Shelve4.mirror = true;
		setRotation(Shelve4, 0F, 0F, 0F);
		Shelve5 = new ModelRenderer(this, 0, 104);
		Shelve5.addBox(0F, 0F, 0F, 10, 1, 4);
		Shelve5.setRotationPoint(-7F, 16F, -6F);
		Shelve5.setTextureSize(128, 128);
		Shelve5.mirror = true;
		setRotation(Shelve5, 0F, 0F, 0F);
		Glass = new ModelRenderer(this, 108, 0);
		Glass.addBox(0F, 0F, 0F, 10, 22, 0);
		Glass.setRotationPoint(-7F, -4F, -8F);
		Glass.setTextureSize(128, 128);
		Glass.mirror = true;
		setRotation(Glass, 0F, 0F, 0F);
		CanBottom = new ModelRenderer(this, 77, 47);
		CanBottom.addBox(0F, 0F, 0F, 2, 3, 2);
		CanBottom.setRotationPoint(3F, 20F, -7F);
		CanBottom.setTextureSize(128, 128);
		CanBottom.mirror = true;
		setRotation(CanBottom, 0F, 0F, 1.570796F);
		Can1 = new ModelRenderer(this, 77, 47);
		Can1.addBox(0F, 0F, 0F, 2, 3, 2);
		Can1.setRotationPoint(-5F, -3F, -5.5F);
		Can1.setTextureSize(128, 128);
		Can1.mirror = true;
		setRotation(Can1, 0F, 0F, 0F);
		Can2 = new ModelRenderer(this, 86, 59);
		Can2.addBox(0F, 0F, 0F, 2, 3, 2);
		Can2.setRotationPoint(-1F, -3F, -5F);
		Can2.setTextureSize(128, 128);
		Can2.mirror = true;
		setRotation(Can2, 0F, 0F, 0F);
		Can3 = new ModelRenderer(this, 86, 59);
		Can3.addBox(0F, 0F, 0F, 2, 3, 2);
		Can3.setRotationPoint(-3F, 0F, -6F);
		Can3.setTextureSize(128, 128);
		Can3.mirror = true;
		setRotation(Can3, 1.570796F, 0F, 0F);
		Can4 = new ModelRenderer(this, 86, 47);
		Can4.addBox(0F, 0F, 0F, 2, 3, 2);
		Can4.setRotationPoint(-6F, 1F, -5.5F);
		Can4.setTextureSize(128, 128);
		Can4.mirror = true;
		setRotation(Can4, 0F, 0F, 0F);
		Can5 = new ModelRenderer(this, 95, 47);
		Can5.addBox(0F, 0F, 0F, 2, 3, 2);
		Can5.setRotationPoint(0F, 1F, -5F);
		Can5.setTextureSize(128, 128);
		Can5.mirror = true;
		setRotation(Can5, 0F, 0F, 0F);
		Can6 = new ModelRenderer(this, 95, 47);
		Can6.addBox(0F, 0F, 0F, 2, 3, 2);
		Can6.setRotationPoint(-3F, 4F, -6F);
		Can6.setTextureSize(128, 128);
		Can6.mirror = true;
		setRotation(Can6, 1.570796F, 0F, 0F);
		Can7 = new ModelRenderer(this, 86, 47);
		Can7.addBox(0F, 0F, 0F, 2, 3, 2);
		Can7.setRotationPoint(-2F, 1F, -5.5F);
		Can7.setTextureSize(128, 128);
		Can7.mirror = true;
		setRotation(Can7, 0F, 0F, 0F);
		Can8 = new ModelRenderer(this, 86, 53);
		Can8.addBox(0F, 0F, 0F, 2, 3, 2);
		Can8.setRotationPoint(0.5F, 5F, -5.5F);
		Can8.setTextureSize(128, 128);
		Can8.mirror = true;
		setRotation(Can8, 0F, 0F, 0F);
		Can9 = new ModelRenderer(this, 86, 53);
		Can9.addBox(0F, 0F, 0F, 2, 3, 2);
		Can9.setRotationPoint(-5F, 5F, -5F);
		Can9.setTextureSize(128, 128);
		Can9.mirror = true;
		setRotation(Can9, 0F, 0F, 0F);
		Can10 = new ModelRenderer(this, 86, 59);
		Can10.addBox(0F, 0F, 0F, 2, 3, 2);
		Can10.setRotationPoint(-2F, 8F, -6F);
		Can10.setTextureSize(128, 128);
		Can10.mirror = true;
		setRotation(Can10, 1.570796F, 0F, 0F);
		Can11 = new ModelRenderer(this, 77, 53);
		Can11.addBox(0F, 0F, 0F, 2, 3, 2);
		Can11.setRotationPoint(-6F, 9F, -5.5F);
		Can11.setTextureSize(128, 128);
		Can11.mirror = true;
		setRotation(Can11, 0F, 0F, 0F);
		Can12 = new ModelRenderer(this, 104, 47);
		Can12.addBox(0F, 0F, 0F, 2, 3, 2);
		Can12.setRotationPoint(2F, 10F, -5.5F);
		Can12.setTextureSize(128, 128);
		Can12.mirror = true;
		setRotation(Can12, 0F, 0F, 1.570796F);
		Can13 = new ModelRenderer(this, 77, 53);
		Can13.addBox(0F, 0F, 0F, 2, 3, 2);
		Can13.setRotationPoint(-3F, 12F, -6F);
		Can13.setTextureSize(128, 128);
		Can13.mirror = true;
		setRotation(Can13, 1.570796F, 0F, 0F);
		Can14 = new ModelRenderer(this, 77, 59);
		Can14.addBox(0F, 0F, 0F, 2, 3, 2);
		Can14.setRotationPoint(0F, 13F, -5.5F);
		Can14.setTextureSize(128, 128);
		Can14.mirror = true;
		setRotation(Can14, 0F, 0F, 0F);
		Can15 = new ModelRenderer(this, 77, 59);
		Can15.addBox(0F, 0F, 0F, 2, 3, 2);
		Can15.setRotationPoint(-3F, 14F, -5F);
		Can15.setTextureSize(128, 128);
		Can15.mirror = true;
		setRotation(Can15, 0F, 0F, 1.570796F);
		Can16 = new ModelRenderer(this, 77, 59);
		Can16.addBox(0F, 0F, 0F, 2, 3, 2);
		Can16.setRotationPoint(-2F, 16F, -6F);
		Can16.setTextureSize(128, 128);
		Can16.mirror = true;
		setRotation(Can16, 1.570796F, 0F, 0F);
		Button1 = new ModelRenderer(this, 0, 3);
		Button1.addBox(0F, 0F, 0F, 2, 1, 1);
		Button1.setRotationPoint(4F, 2F, -8.3F);
		Button1.setTextureSize(128, 128);
		Button1.mirror = true;
		setRotation(Button1, 0F, 0F, 0F);
		Button2 = new ModelRenderer(this, 0, 0);
		Button2.addBox(0F, 0F, 0F, 2, 1, 1);
		Button2.setRotationPoint(4F, 0F, -8.3F);
		Button2.setTextureSize(128, 128);
		Button2.mirror = true;
		setRotation(Button2, 0F, 0F, 0F);
		Button3 = new ModelRenderer(this, 0, 6);
		Button3.addBox(0F, 0F, 0F, 2, 1, 1);
		Button3.setRotationPoint(4F, 4F, -8.3F);
		Button3.setTextureSize(128, 128);
		Button3.mirror = true;
		setRotation(Button3, 0F, 0F, 0F);
		Button4 = new ModelRenderer(this, 0, 9);
		Button4.addBox(0F, 0F, 0F, 2, 1, 1);
		Button4.setRotationPoint(4F, 6F, -8.3F);
		Button4.setTextureSize(128, 128);
		Button4.mirror = true;
		setRotation(Button4, 0F, 0F, 0F);
		Button5 = new ModelRenderer(this, 7, 0);
		Button5.addBox(0F, 0F, 0F, 2, 1, 1);
		Button5.setRotationPoint(4F, 8F, -8.3F);
		Button5.setTextureSize(128, 128);
		Button5.mirror = true;
		setRotation(Button5, 0F, 0F, 0F);
		Button6 = new ModelRenderer(this, 7, 3);
		Button6.addBox(0F, 0F, 0F, 2, 1, 1);
		Button6.setRotationPoint(4F, 10F, -8.3F);
		Button6.setTextureSize(128, 128);
		Button6.mirror = true;
		setRotation(Button6, 0F, 0F, 0F);
		Button7 = new ModelRenderer(this, 7, 6);
		Button7.addBox(0F, 0F, 0F, 2, 1, 1);
		Button7.setRotationPoint(4F, 12F, -8.3F);
		Button7.setTextureSize(128, 128);
		Button7.mirror = true;
		setRotation(Button7, 0F, 0F, 0F);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shelve1.render(f5);
		Shelve2.render(f5);
		Shelve3.render(f5);
		Shelve4.render(f5);
		Shelve5.render(f5);
		Glass.render(f5);
		CanBottom.render(f5);
		Can1.render(f5);
		Can2.render(f5);
		Can3.render(f5);
		Can4.render(f5);
		Can5.render(f5);
		Can6.render(f5);
		Can7.render(f5);
		Can8.render(f5);
		Can9.render(f5);
		Can10.render(f5);
		Can11.render(f5);
		Can12.render(f5);
		Can13.render(f5);
		Can14.render(f5);
		Can15.render(f5);
		Can16.render(f5);
		Button1.render(f5);
		Button2.render(f5);
		Button3.render(f5);
		Button4.render(f5);
		Button5.render(f5);
		Button6.render(f5);
		Button7.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}