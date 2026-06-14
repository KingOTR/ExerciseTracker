package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplehike.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleHike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPersonSimpleHike", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleHike", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplehikeKt {
    private static ImageVector _personSimpleHike;

    public static final ImageVector getPersonSimpleHike(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _personSimpleHike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleHike", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 76.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 152.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 28.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 144.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(188.0f, 147.92f);
        pathBuilder.curveToRelative(-26.68f, -1.13f, -34.8f, -13.66f, -42.67f, -25.79f);
        pathBuilder.curveToRelative(-3.53f, -5.46f, -6.87f, -10.61f, -12.0f, -15.0f);
        pathBuilder.curveToRelative(-0.66f, -0.56f, -1.33f, -1.1f, -2.0f, -1.6f);
        pathBuilder.lineTo(114.5f, 144.29f);
        pathBuilder.lineToRelative(39.83f, 28.45f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 176.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(148.0f, 178.06f);
        pathBuilder.lineTo(111.23f, 151.8f);
        pathBuilder.lineTo(75.67f, 233.59f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 236.0f);
        pathBuilder.arcToRelative(4.08f, 4.08f, 0.0f, false, true, -1.59f, -0.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.08f, -5.27f);
        pathBuilder.lineTo(125.86f, 98.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.5f, -2.0f);
        pathBuilder.arcToRelative(37.24f, 37.24f, 0.0f, false, true, 7.26f, 4.94f);
        pathBuilder.curveToRelative(5.94f, 5.15f, 9.74f, 11.0f, 13.42f, 16.71f);
        pathBuilder.curveTo(159.77f, 129.7f, 166.45f, 140.0f, 192.0f, 140.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.68f, -2.43f);
        pathBuilder.lineToRelative(24.0f, -56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.1f, -5.25f);
        pathBuilder.lineToRelative(-28.0f, -12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.26f, 2.1f);
        pathBuilder.lineToRelative(-24.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.11f, 5.26f);
        pathBuilder.lineToRelative(28.0f, 12.0f);
        pathBuilder.arcTo(3.94f, 3.94f, 0.0f, false, false, 72.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(49.25f, 129.9f);
        pathBuilder.lineTo(70.1f, 81.25f);
        pathBuilder.lineTo(90.75f, 90.1f);
        pathBuilder.lineTo(69.9f, 138.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleHike = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
