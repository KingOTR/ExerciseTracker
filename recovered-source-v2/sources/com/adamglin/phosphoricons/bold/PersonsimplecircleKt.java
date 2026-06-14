package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplecircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPersonSimpleCircle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplecircleKt {
    private static ImageVector _personSimpleCircle;

    public static final ImageVector getPersonSimpleCircle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _personSimpleCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 80.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(140.0f, 132.0f);
        pathBuilder.verticalLineToRelative(0.51f);
        pathBuilder.lineToRelative(26.12f, 41.05f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.68f, 16.56f);
        pathBuilder.arcTo(11.83f, 11.83f, 0.0f, false, true, 156.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.13f, -5.56f);
        pathBuilder.lineTo(128.0f, 158.35f);
        pathBuilder.lineToRelative(-17.88f, 28.09f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.24f, -12.88f);
        pathBuilder.lineTo(116.0f, 132.51f);
        pathBuilder.lineTo(116.0f, 132.0f);
        pathBuilder.lineTo(84.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
