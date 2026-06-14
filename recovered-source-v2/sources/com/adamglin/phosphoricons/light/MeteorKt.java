package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Meteor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Meteor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMeteor", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_meteor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MeteorKt {
    private static ImageVector _meteor;

    public static final ImageVector getMeteor(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _meteor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Meteor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(96.0f, 122.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 96.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 186.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 96.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.24f, 123.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-48.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineToRelative(48.0f, -48.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 220.24f, 123.76f);
        pathBuilder.close();
        pathBuilder.moveTo(164.24f, 132.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(228.24f, 68.24f);
        pathBuilder.lineTo(212.24f, 84.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(123.76f, 91.76f);
        pathBuilder.lineToRelative(72.0f, -72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineToRelative(-72.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(145.5f, 201.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, true, -99.0f, -99.0f);
        pathBuilder.lineToRelative(82.75f, -82.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.48f);
        pathBuilder.lineTo(55.0f, 119.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, true, false, 82.0f, 82.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 145.5f, 201.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _meteor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
